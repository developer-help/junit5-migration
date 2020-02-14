# junit5-migration

This project is for show casing step by step migration path from Junit 4 to Junit 5.

1. Started with old spring boot version project.
2. Created a simple calculator project with dependency classes for calculator
3. Wrote jnit 4 tests with SpringJunit4Runner and mockito
4. Upgraded with Spring boot 2.2.3 version and excluding deps in Pom file for Junit-jupiter-vintage engine
5. Updated packages for @Test and assert etc as per Junit5
6. Changed runner to SpringExtension
7. Updated how we write assertion for exception.

