#!/bin/bash
# Run this script to easily test your solution
test=1

# Uncomment these next lines to test other inputs!
# test=2
# test=3

clear

ACTUAL=`java -cp bin Solution < in${test}.txt`
EXPECTED=`cat out${test}.txt`
[ "${ACTUAL}" == "${EXPECTED}" ] && SUCCESS=1 || SUCCESS=0

echo ''
echo 'actual  : '${ACTUAL}
echo 'expected: '${EXPECTED}
echo ''
[ "${SUCCESS}" == "1" ] && echo 'Success!' || echo 'Fail!'
echo ''
