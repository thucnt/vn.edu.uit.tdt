name := "tdt"

version := "1.0"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "spring" at "http://repo.spring.io/milestone",
  "neo4j-releases" at "http://m2.neo4j.org/releases/",
  "Neo4j Cypher DSL Repository" at "http://m2.neo4j.org/content/repositories/releases",
  "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"
)

libraryDependencies ++= Seq(
  "org.springframework.data" % "spring-data-neo4j"         % "4.0.0.RELEASE"      % "compile",
  "org.neo4j"                % "neo4j-cypher-dsl"          % "2.3.1"         % "compile",
  "javax.persistence"        % "persistence-api"           % "1.0"           % "compile",
  "javax.validation"         % "validation-api"            % "1.1.0.Final"      % "compile",
  "junit"                    % "junit"                     % "4.11"          % "test",
  "com.novocode"             % "junit-interface"           % "0.9"           % "test",
  "org.springframework"      % "spring-test"               % "4.0.0.RELEASE" % "test",
  "org.apache.spark"         % "spark-core_2.11"           % "2.1.0",
  "org.apache.spark"         % "spark-graphx_2.11"         % "2.1.0",
  "org.apache.spark"         % "spark-sql_2.11"            % "2.1.0",
  "neo4j-contrib" % "neo4j-spark-connector" % "2.0.0-M2"
)
