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
                    
                    

