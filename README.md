Sample project using Maven Gatling plugin
=========================

## Structure 
Project is separated on Requests, Scenarious and Simulations. Simulation is the highest element in the project hierarchy which includes Scenarious and Requests. 

## Running
For running of tests execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=simulations.MagentoStoreSimulation

or simply:

    $mvn gatling:test
