/*
3a)
'&' bitwise and
'|' bitwise or
'^' bitwise xor
'<<' left shift
'>>' right shift
'~' not
b) i)

a >> N
reason: as b is 2 to the power of N, shifting to the right by N is the equivalent of dividing by b.
ii)
(b - 1) & a
reason: b - 1 is equivalent to a string of 1's N long when b is 2 to the power of N, therefore the bitwise and operation will return the value of the last N digits of a, equivalent to a % b.
*/
