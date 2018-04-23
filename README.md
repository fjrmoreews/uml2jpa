# uml2jpa
An extensible  MDA Java  class generator using UML class diagram  and Epsilon

Authors : Francois Moreews  and  Kevin Courtet - 2018



A proof of concept of a simple and flexible model driven custom JPA Class generator 

* using UML class diagram (XMI format) 

* Epsilon EGL 

* tested with Modelio  /UML 3 export 

# installation:
## dependencies:
  * need Java, minimum version 8 
  * better on Linux systems (optional bash scripts)

## test
```
cd uml2jpa
#input model is example/model1.uml (XMI format genarated from modelio /UML 3 export  )


bash ./generate_test1.sh 
# or
ant test
ls example/test1/gen/
cp -r example/test1/gen src/
```


## configuration
 * create your own model as a class diagram from an UML designer tool
 * add constraints in attributes with real Java annotation syntax (except @ char), (e.g. javax.validation.constraints.* )
 * export your class diagram   as XMI (e.g. example/model1.uml)
 * ant test
 * ls example/gen/
