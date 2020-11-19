package EnArmetTyveknægt;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Victor
 */
public class FXMLBanditController implements Initializable {

    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;
    @FXML
    private Button stopButton1;
    @FXML
    private Button stopButton2;
    @FXML
    private Button stopButton3;
    @FXML
    private Button startButton;
    @FXML
    private Label resultLabel;

    private Image[] images;

    //Creating Threads.
    private Thread t1;
    private Thread t2;
    private Thread t3;
    //This integer will be set to count the current running threads.
    private int threadRunning = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Initializing the fruit images through a for loop.
        images = new Image[10];
        String pre = "fruits";
        String post = ".png";
        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(new File(pre + i + post).toURI().toString());
        }
        //Setting images as a start so the imageViews aren't empty when the program starts.
        imageView1.setImage(images[1]);
        imageView2.setImage(images[5]);
        imageView3.setImage(images[8]);
    }

    @FXML
    private void handleStop1Action(ActionEvent event) {
        t1.interrupt();
        //If the stop button is pressed before the start button an ->
        //InvocationTargetException will happen. In this case it is not a problem.
        stopButton1.setDisable(true);
    }

    @FXML
    private void handleStop2Action(ActionEvent event) {
        t2.interrupt();
        stopButton2.setDisable(true);
    }

    @FXML
    private void handleStop3Action(ActionEvent event) {
        t3.interrupt();
        stopButton3.setDisable(true);
    }

    @FXML
    private void handleStartButtonAction(ActionEvent event) {
        //Disable startButton and set text running.
        startButton.setDisable(true);
        resultLabel.setText("Running..");
        //Creating the three BanditRunnables/tasks.
        Runnable thread1 = new BanditRunnable(1, 120, imageView1);
        Runnable thread2 = new BanditRunnable(5, 100, imageView2);
        Runnable thread3 = new BanditRunnable(8, 140, imageView3);
        //Initializing threads.
        t1 = new Thread(thread1);
        t2 = new Thread(thread2);
        t3 = new Thread(thread3);
        //Setting daemon as true(Daemon thread).
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        //Starting threads.
        t1.start();
        t2.start();
        t3.start();
        //Enabling Stop buttons.
        stopButton1.setDisable(false);
        stopButton2.setDisable(false);
        stopButton3.setDisable(false);
    }

    private synchronized void threadCount(boolean b) {
        //Counting running threads.
        if (b) {
            threadRunning++;
        } else {
            threadRunning--;
        }
        //If all threads have stopped the following messages will be given to resultLabel.
        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                if (threadRunning == 0) {
                    if (imageView1.getImage() == imageView2.getImage() && imageView2.getImage() == imageView3.getImage() && imageView1.getImage() == imageView3.getImage()) {
                        resultLabel.setText("3 ens: Jackpot!!!");
                    } else if (imageView1.getImage() != imageView2.getImage() && imageView2.getImage() != imageView3.getImage() && imageView1.getImage() != imageView3.getImage()) {
                        resultLabel.setText("TABER!!!");
                    } else {
                        resultLabel.setText("2 ens: Du vinder lidt");
                    }
                    startButton.setDisable(false);
                }
            }
        });
    }

    public class BanditRunnable implements Runnable {

        private int i; //Index of current picture    
        private long sleepTime;
        private boolean running = true;
        private ImageView iw;

        public BanditRunnable(int i, long sleepTime, ImageView iw) {
            this.i = i;
            this.sleepTime = sleepTime;
            this.iw = iw;
        }

        @Override
        public void run() {
            //Using a random to choose a random image. 
            Random r = new Random();
            threadCount(true);

            while (running) {

                i = r.nextInt(10);

                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                        iw.setImage(images[i]);
                    }
                });
                //Synchronizing this so that only one thread can be interuppted at a time. 
                //And so that the threadCount only counts one at a time. 
                synchronized (this) {
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException ex) {
                        running = false;
                        threadCount(false);
                        System.out.println("!!!Thread Run Interrupted!!! " + Thread.currentThread());
                    }
                }
            }
        }
    }
}