#!/bin/bash
JAVA=java
OPT="  -Dfile.encoding=UTF-8"
LIB=$(echo lib/*.jar | tr ' ' ':')
CLS="mda.uml.generator.UML2JPAGenerator"
JAR=generator.uml.jpa.jar

outdir="example/pegase_v1"
 
model="example/pegase_v1/model.uml" # xmi file (tested from modelio)



modeltmp="example/modtmp.uml"

#hack to fix UML version issue
cat  $model | sed s=uml2/3.0.0/UML=uml2/5.0.0/UML=  > $modeltmp

PARAM=" -m $modeltmp  -x  example/pegase_v1/codegen.egx "
rm -f "$outdir/gen/*java"

echo $JAVA $OPT -cp $LIB:$JAR $CLS $PARAM

$JAVA $OPT -cp $LIB:$JAR $CLS $PARAM

ls -l $outdir
rm -f $modeltmp

