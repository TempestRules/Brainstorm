import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hangman',
  templateUrl: './hangman.component.html',
  styleUrls: ['./hangman.component.css']
})
export class HangmanComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  game(): void {
    let words = ['javascript', 'typescript', 'brainstorm', 'programming'];

    let word = words[Math.floor(Math.random() * words.length)];
  
    let answer = [];
    for (let i = 0; i < word.length; i++) {
      answer[i] = '_';
    }

    let remainingLetters = word.length;

    //The game loop
    while(remainingLetters > 0) {
      alert(answer.join(' '));

      let guess = prompt("Guess a letter, or click Cancel to stop playing");

      if (guess === null) {
        //End the game
        break;
      } else if (guess.length !== 1) {
        alert("Please enter a single letter.");
      } else {
        //Update the game
        for (let j = 0; j < word.length; j++) {
          if (word[j] === guess) {
            answer[j] = guess;
            remainingLetters--;
          }
        }
      }
    }

    //Congratulations to the player.
    alert(answer.join(' '));
    alert('Good job! The answer was ' + word);
  }

}
