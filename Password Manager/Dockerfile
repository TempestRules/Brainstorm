FROM mysql

# Set password
ENV MYSQL_ROOT_PASSWORD=secure

# Adding sql script to the image
# All scripts in the following directory are automatically executed.
COPY ./sql-script/ /docker-entrypoint-initdb.d/

# Create/build the image
# - docker build -t database .

# Run it with the following command
# - docker run -p 3306:3306 database
# Add -d if you want it to run in the background
