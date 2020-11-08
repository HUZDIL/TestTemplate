"# Liquibase_Task" 

Liquibase Company Task

Run Steps;

1.You have to go web page and create new account.

2.You have to write your account information (username and password)
 into configuration.properties file.
 
3.Go to Features class under the resources and open which task you want to run 
 and run.
 
 OR anhother way (most common)
 
4.Go to CukesRunner class. 

 1.  for the first task ; you have to write 
               
                tags ="@firstTag", 

 2.  for the second task ; you have to write 
                   
                    tags ="@secondTask", 
 3.if you remove the tags annotations, it will work orderly.
   
3.if you got "UndefinedStepException"  exception you have to check it 
your cucumber java version.  


My Pattern

I used the page object model to create this project. And I also used Behavior Driven Development method because BDD is end-user’s approach perspective. 
Feature and Step Definition are the most important part  for BDD framework.
I stored web elements and methods related to that PAGE into its own JAVA CLASS.
I used this model because of , RE-USABILITY, EASY TO MAINTAIN, EASY TO MANAGE.
Page Object Model is not a framework, it is a design pattern.

P.S:There are many hard-coding parts in my solutions because of to save time for this task, 
but in real life i try to minimaze the hard-coding.
To minimaze hard-coding and to easy maintaing I use configuration.properties file.
            
                    
                    

