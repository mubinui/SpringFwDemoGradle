JDBC Concept
    => JDBC is an API perform operation with database CRUD

Problems of normal  JDBC
    => We need to write a lots of code
        ->Connection open
        ->Statement
        ->execute
        ->Connection close
    => For every query we need to use these codes all these time
    => Exception handling problem -> every time need to use try catch
    => Time consuming



Why Spring JDBC
    => Less code
    => No Exception problem
    => No need to repeat the business logics



Spring JDBC Template
    => Firing queries ( insert delete update ) making a object of Spring_JDBC_Template
        -> Spring_JDBC_template takes an object of DataSource(interface)
        -> DataSource has url user password
        -> The implement class of DataSource is -> DriverManagerDataSource <-
        -> DriverManagerDataSource takes four information driverClassName , url , username, password



Spring JDBC important methods
    -> update() -> insert , update , delete
    -> execute() -> provides us result so we can get result set || it is used for select queries


