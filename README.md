# uml2jpa
An extensible  MDA Java  class generator  using UML class diagram  and Epsilon

Authors : Francois Moreews  and  Kevin Courtet - 2018



A proof of concept of a simple and flexible model driven custom JPA Class generator 

* using UML class diagram (XMI format) 

* Epsilon EGL 

* tested with Modelio  /UML 3 export 

installation:

need Java 8 and Linux system

```
cd uml2jpa
#input model is example/model1.uml (XMI format genarated from modelio /UML 3 export  )
bash ./runUML2JPA.sh 
# or
ant test
ls example/gen/
cp -r example/gen src/
```
