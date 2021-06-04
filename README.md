# Covid Risk App API

## Description

REST API built specifically to work with Android mobile application. Currently deployed on Heroku. POST
request takes in covid risk factor data and returns simulated AI results as an integer value. Future release
will feature backend AI neural network that simulates outcomes of Covid cases.

## Documentation
      BASE_URL:  https://covid-risk-app-api.herokuapp.com/
      GET(/test): returns 63 in JSON format
      POST(/result): JSON object is required parameter, returns integer in JSON format

## JSON Object Format
    {
        "age": (int value),
        "sex": (int value),
        "tobacco": (int value),
        "contact_other_covid": (int value),
        "inmsupr": (int value),
        "copd": (int value),
        "diabetes": (int value),
        "renal_chronic": (int value),
        "obesity": (int value),
        "pregnancy": (int value), 
        "hypertension": (int value),
        "asthma": (int value),
        "cardiovascular": (int value),
        "pneumonia": (int value),
        "covid_res": (int value),
        "other_disease": (int value)
     }
        
