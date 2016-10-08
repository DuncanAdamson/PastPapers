/*
a) A prepared statement is a parameterised version of the statement class, which pre executes most of the query, such as the compilation and optimization, before executing. Statements are more useful when only executing a single, non-parameterised, statement, as they save time on having to parametrise the statement, where as a prepared statement would be much faster for batch processing of data.
*/
/*
b) I can't find anything about this (or the last one TBH) in the notes, so I'm going to skip it for now, if anyone see's it, just message me about where.
*/
/*
c)i)  A lossless-join means that the decomposed data will, when re-joined, return the same data as there was originally.
      Dependency preservation means that the functional dependencies that applied on the original relation are still applied on the new relation.
ii)   Losses-join is preserved by joining on postcode, which will produce the same set of data as the original data,
      Dependency preservation is satisfied due to both the functional relations having all the required data in the decomposition.
*/
/*
d)i) Starting at the last command and working backwards, the DBMS would perform the opposite action for each statement, including those from T2, until it reached the top. Then execute, from the top down, all other transactions, in this case T2.
ii)   As the DBMS effectively preforms another transaction, the consistency property ensures that after this the data will be consistent throughout after this transaction was aborted.
*/
/*
e)  Again, not sure this is covered anymore? if anyone knows though add it
*/
