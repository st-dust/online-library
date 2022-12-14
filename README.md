# Implementation of basic library management system

## Overview

Web aplication used to manage customers of library and books.

Built using Java Spring framework, Maven, Thymeleaf, HTML5, PostgreSQL as database and GIT as Version Control System.

## Architecture and design

  - There are two entites that have relation one to many. People that visit library can have multiple books lent to them, but one book can be lent to only  one person at the time. 
  - People can't take books that are currently in lending by someone else. 
  - Application allows to lookup for all of the people and books, create, edit and delete them from database. 
  - Also there is an option to assign lenders of book that is free to lent and release book from lending that was lent to someone.

## Reflection

   - This project is my side projet for practicig stack of technologies used for its development.
   - Putting together all application components gave me learning experience of creating functional aplication
   - When quering database for needed output I trained my skills in working with relational databases.
   - I used Java Spring framework because of it's great simplification of development proces of application, so I can focuse more on logics and architecture of an app.
 Maven and HTML5 usefull and able to provide good output. Thymeleaf was chosen to simplify fronted development integration with backend. For bounding PostgreSQL database and Spring web application i used Spring JDBC.
 
 ## How to run
 
   1. Clone this **src/main** directory from this repository.
   2. Run PostgreSQL database on your machine.
   3. Make sure you've installed proper JDBC driver. 
   4. Save all configuration data about your database (url, login, password) and JDBC driver information in directory **src/main/resources/** in file with name **database.properties**. All the fields should match **database.properties.origin** file that already exists in repository.
   5. For creation compatible tables for this project you need to execute queries that are in Queries.txt file in your PostgreSQL console.
   6. Then run application and try it out in your browser.
   
## Project Screen Shots

People:

![peopleIndex](https://user-images.githubusercontent.com/66835270/183897313-61fd0c53-0d4c-4eff-8eb6-b93c93322cee.png)

![peoplePerson](https://user-images.githubusercontent.com/66835270/183897318-b18160c0-91b0-42b4-895c-90276ca9d2cc.png)

![personThatHasBook](https://user-images.githubusercontent.com/66835270/184020871-038dfe2a-e8ff-439a-bc49-90a0177fdf8c.png)

![peopleNewPerson](https://user-images.githubusercontent.com/66835270/183897316-b4b2cb5a-13e0-4ace-a17e-a614be7029cb.png)

![editPerson](https://user-images.githubusercontent.com/66835270/183897312-b3c2cbf8-b560-46bc-a151-abd772fc0ca4.png)

Books:

![booksIndex](https://user-images.githubusercontent.com/66835270/183897309-cf458888-9349-4261-be8f-4f9aa6dca26f.png)

![bookThatIsLentToPerson](https://user-images.githubusercontent.com/66835270/184020351-fa7627b5-a47d-44e7-b95b-3bfe08fa2f34.png)

![secondBookLent](https://user-images.githubusercontent.com/66835270/184021298-d1882006-33bd-4946-b6e8-df1c18ddb5fd.png)

![booksBook](https://user-images.githubusercontent.com/66835270/183897304-736f7bd8-90a4-4aab-b582-f72e50a84fb4.png)

![booksNewBook](https://user-images.githubusercontent.com/66835270/183897311-ad70c97f-8bf6-4dd4-a2c8-da6fe7ab9e11.png)

![booksEditBook](https://user-images.githubusercontent.com/66835270/183897308-304515d2-0da8-40e1-922d-3af3204bd570.png)
