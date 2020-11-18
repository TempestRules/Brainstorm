FROM mysql

# Set password
ENV MYSQL_ROOT_PASSWORD=secure

# Create a database
ENV MYSQL_DATABASE users

# Adding sql script to the image
# All scripts in the following directory are automatically executed.
COPY ./sql-script/ /docker-entrypoint-initdb.d/

# Create/build the image
# - docker build -t database .

# Run it with the following command
# - docker run -d -p 3306:3306 --name mysql \ -e MYSQL_ROOT_PASSWORD=secure database




# -----------------NOT USED---------------------- #

#Run container interactively
# - docker run -it TAG bash

#Update ubuntu first:
# - apt-get update
# - apt-get upgrade
#Install the sql server:
# - apt install mysql-server
# - mysql_secure_installation

# CMD bash
