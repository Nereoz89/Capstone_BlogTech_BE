![logo](https://github.com/Nereoz89/Capstone_BlogTech_FE/blob/main/frontend/src/assets/logo.png)

                               BlogTech Backend

BlogTech backend server is an efficient component of BlogTech application that you can find here -> https://github.com/Nereoz89/Capstone_BlogTech_FE, responsible for handling various backend functionalities, including user authentication, order processing, and communication with external APIs.

Developed using the Spring framework, this server ensures smooth and reliable operation, enabling seamless integration with the frontend client.

Key Features:
User Authentication and Authorization: The backend server provides secure endpoints for user registration, login, and authentication, ensuring that only authorized users can access the application's features.

Posts management: With dedicated endpoints for posts creation delete and updates, the server facilitates efficient order processing and management, enhancing the overall user experience.

User management: Update your bio in the profile page

Category management: create and delete category

Comment mangement: Create comment and delete

Database Management: As and Admin in sinergy whit front end you can delete users and posts, create and delete category and see activity

Data Persistence and Storage: Utilizing Spring Data JPA and relational database management systems

Security Measures: The backend server implements robust security measures, including encryption, input validation, and access control, to protect sensitive user data and prevent unauthorized access or malicious activities.

Installation
1- Clone the repository:

$ git clone https://github.com/Nereoz89/Capstone_BlogTech_BE

Environment Variables Configuration
In your root folder create a file named env.properties and add it to .gitignore

Add the values just created in the env.properties file, see example below:

DB_PASSWORD=yourbdpassword

DB_USERNAME=yourpostgresusername

DB_NAME=thenamechosenforthedatabase

JWT_SECRET=thejwtsecretusedforhashingthepasswordsoftheusersTheLongerTheBetter

PORT_SERVER=yourlocalhostportserver
