/*
a) A prepared statement is a prarameterised version of the statement class, which pre executes most of the querry, such as the compilation and optimization, before executing. Statements are more useful when only executing a single, non-paramaterised, statement, as they save time on having to parameratise the statement, where as a prepared statement would be much faster for batch proccessing of data.
*/
/*
b) I can't find anything about this (or the last one TBH) in the notes, so I'm going to skip it for now, if anyone see's it, just message me about where.
*/
/*
c)i)  A losseless-join means that the decompossed data will, when re-joined, return the same data as there was orginaly.
      Dependency preservation means that the functional dependencies that applied on the orginal relation are still appiled on the new relation.
ii)   Losses-join is preserved by joining on postcode, which will produce the same set of data as the orginal data,
      Dependency preservition is statisfied due to both the functional relations having all the required data in the decomposition.
*/
/*
d)i)  Starting at the last command and working backwards, the DBMS would prefrom the oposiste action for each statement, including those from T2, until it reached the top. Then execute, from the top down, all other transactions, in this case T2.
ii)   As thie DBMS effectively preforms another transaction, the conscientancy property ensures that after this the data will be consistent throughout after this transaction was aborted.
*/
/*
e)  Again, not sure this is covered anymore? if anyone knows though add it 
*/
