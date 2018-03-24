# Welcome to the Payment Processing Example

## Purpose
This repository contains an example of payment processing which I use Authorize.net API as my payment gateway.

##Rules of the Repository
* Master branch is production, period.
* Do not commit to master, please work off the development branch.
* When working locally, try to work in feature branches.

## Build Script

The following command will being a clean build for the local instance. To target another instance modify the `-Penv` flag. 

`clean build -Penv=local`