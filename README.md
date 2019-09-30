Sample project using Maven Gatling plugin
=========================

## Structure 
Project is separated on Requests, Scenarios and Simulations. Simulation is the highest element in the project hierarchy which includes Scenarios and Requests. 

## Running
For running of tests execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=simulations.MagentoStoreSimulation

or simply:

    $mvn gatling:test

## Reports 
Various reports based on test results can be found in `target/gatling/<testRunName>/index.html`

## Debugging
For proper debugging of Gatling test run it is recommended to use Proxy: Fiddler, Charles, Mitmproxy. Sample project contains proxy settings forwarding to `8080` port
