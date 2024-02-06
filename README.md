Maven Repository: Search/Browse/Explore https://mvnrepository.com

### **How to static import AssertJ in VS Code**
AssertJ helps you to write assertions in unit testing. Compared to Hamcrest, someone, like me, think AssertJ’s API and syntax make more sense.
* First, you need to introduce it. In maven, it’s very straightforward. Simply define a new dependency in pom.xml:
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.11.1</version>
    <scope>test</scope>
</dependency>
* Next step is to update a configuration “java.completion.favoriteStaticMembers“. 
Otherwise, assertThat() will be the one in Hamcrest in the auto-completion. 
Remove "org.junit.Assert.*" from the user configuration and add "org.assertj.core.api.Assertions.*" instead.

