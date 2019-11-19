# Proyecto de ejemplo de pruebas Javascript integradas en Maven
## Arranque de aplicación
mvn jetty:run
## Lanzamiento pruebas JS
mvn jasmine:bdd
## Url de jazmine
[http://localhost:8234/](http://localhost:8234/)
## Lanzamiento pruebas PhantomJS
mvn jasmine:test
## Lanzamiento de Pruebas
mvn test
## Reporting (target/surefire-report target/site/surefire-report.html)
mvn surefire-report:report