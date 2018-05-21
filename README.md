# Web Application based on Spring Boot
This Application designed to teach students.



## Installation Steps
1. #### Follow these steps to clone project in your machine and make running

    1. Goto intellij Idea
    1. Goto **VCS** on top bar, then under **Checkout form Version Control**, Click **Git**
    1. Under **Git Repository URL** paste
        ```
        https://github.com/paneru-rajan/samajik-2072-webapp.git
        ```
    1. For Other settings do as per your interest.
    1. Hit **Clone**
    1. **IMPORTANT:** On Import Project Dialogue, In Import project form external model, Please Choose maven.
    1. All Maven dependency should be imported, this usually done automatically by Intellij, otherwise please reimport them. 
1. #### Inorder to test api, download and install Postman 
    1. Please follow this [Link](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) to Install
1. #### To be able run application you need to have PostgreSQL in your machine
    1. ##### Installation   
        1. **For Windows:** Please Follow this [Link](http://www.postgresqltutorial.com/install-postgresql/) or you can directly download form [here](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) and follow steps on your own.
        1. **For Ubuntu:** follow this [link](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-postgresql-on-ubuntu-16-04)
    1. #### Create a Database
        1. Create database named ```samajik-webapp``` otherwise, you need to change configuration on file [application.properties](src/main/resources/application.properties)
        1. Change Database Username, password and other setting in [application.properties](src/main/resources/application.properties)
1. #### Running Application
    1. **Method GET:** You can list all users EG: [http://localhost:8080/api/user](http://localhost:8080/api/user)
    1. **Method GET:** You can list one user provided that you gave an id EG: [http://localhost:8080/api/user/2](http://localhost:8080/api/user/2)
    1. **Method DELETE:** You can delete one user provided that you gave an id EG: [http://localhost:8080/api/user/2](http://localhost:8080/api/user/2)
    1. **Method POST:** You can add a user provided that you gave data like below EG: [http://localhost:8080/api/user](http://localhost:8080/api/user)
        ```
        {
        	"name": "New name to be inserted into database"
        }
        ```
    1. **Method PUT:** You can Update the given user provided that you gave data like below EG: [http://localhost:8080/api/user/3](http://localhost:8080/api/user/3)
        ```
        {
            "name": "New name to be updated into database"
        }
        ```
    1. Finally, Please REMEMBER, to change 
        ```
        Content-Type: application/json
        ```
    
