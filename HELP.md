# How did we setup this repo?

### Inital steps

* We created a project from [spring initializer](https://start.spring.io). Click on generate. Open it in IDE of your choice.
  

* Create a repository in git

  
* Set your git username using the below command 
  
  ``git config --global user.name "<your username>" ``
    
    To verify the above, run the following command: 
  
    ``git config --global user.name``

    >Reference doc: [Config git username](https://docs.github.com/en/get-started/getting-started-with-git/setting-your-username-in-git)
  

* Do "git init" on your local machine. 

    `Note: Make sure you are in the project directory before doing git init`
  
* Set remote repository by running the following command:
  
    `git remote add origin <repository url>`

    `Note: repository url is the repository you created on git at step 2`

    >Reference doc: [setup remote url](https://docs.github.com/en/get-started/getting-started-with-git/managing-remote-repositories)
  
* Now you are able to commit and push changes to remote repository.

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

