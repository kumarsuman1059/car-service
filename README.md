Project Name : Car Service Recording
 The application would keep record of the customers, their car(s), and the individual services and service notes associated with each car.

I have created a spring boot application where I have added one restcontroller class.

I have exposed 4 rest end point:

List all customers. (GET)
localhost:8080/api/carService/getAllUsers

List all car(s) services for a specific customer. (GET)
localhost:8080/api/carService/getAvailableCarService/{userName}

List all services for a specific car. (GET)
localhost:8080/api/carService/getAvailableCarService/{carName}

Record a service for a specific car. (POST)
localhost:8080/api/carService/recordUserCarService/

I have added report for PMD as well as checkstyle.
Reports are available in path : Target folder

I have used Postgres data.

Application will create below mentioned table :
t_carservice
t_user
t_car

One TO One mapping t_user and t_car
One TO One mapping t_user and t_carservice
