/*
c)
*/
String querry = "SELECT MAX (Dog.dogid) as m FROM Dog";
Statement s = conn.createStatement();
ResultSet r = s.executeQuery(querry);
int i = r.getInt("m");
boolean found = false;
String name;
while(! found){
    int id = gen.nextInt(i);
    querry = "SELECT Dog.name as name, Count(*) as c FROM Dog Where dog.dogid = " + id;
    r = s.executeQuery(querry);
    found = r.getInt("c") == 1;
    name = r.getString("name");
}
return name;
