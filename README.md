NOTE : This program uses PostgreSQL Dependency for batabase connectivity.

This is a spring boot API with HTML using ThymLeaf that uses an intreactive webpage to help new user to sign up/create account.

Some changes you have to do in the program are to run on your system are :-

<1>: go to src/main/resources/application.properties and change your databse name ( sspring.datasource.url=jdbc:postgresql://localhost:5432/( Your database name )

<2>: in the same file change your password to your Postgresql password ( spring.datasource.password=( your password )

THE PROGRAM IS TESTED AND VERIFIED ON POSTMAN AND ON ANY BROWSER. DOCUMENTATION FOR THE PROGRAM IS CAN BE SEEN OR TESTED ON SWAGGER.

(.jar) is also included that can be posted on AWS.

Container docker file for packaging on docker.

so change the above following according to your ec2 instance's postgresql before deploying.
