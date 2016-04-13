/*
a)
*/
CREATE TABLE MemberOf(
    bid INT NOT NULL,
    mid INT NOT NULL,
    startyear INT,
    endyear INT,
    instrument VARCHAR(64) NOT NULL,
    FOREIGN KEY (bid) REFERENCES Band(bid),
    FOREIGN KEY (mid) REFERENCES Member(mid),
)
/*
b)
*/

ALTER Release
ADD CHECK ( SELECT a > b 
            FROM (SELECT COUNT(Songs) FROM Songs) a,
                 (SELECT COUNT(Release FROM Release)) b
          )
ADD CHECK (SELECT COUNT(Songs) >= 1 FROM Songs WHERE Songs.rid = rid GROUP BY rid)
/*
This will only allow new releases to be added if there is at least 1 song in it, and there are already more songs than releases, ensuring that there is always will be.
*/
/*
c)
*/
SELECT Member.name AS Member_Name
FROM Member, MemberOf, Band
WHERE Band.name = "Iron Maiden" AND Band.bid - MemberOf.bid AND MemberOf.mid = Member.mid AND MemberOf.endyear IS NULL
ORDER BY Member.name
/*
d)
String Qurrey = "SELECT Band.name as bname, Member.name mname, MemberOf.instrument as inst FROM Band, Member, MemberOf WHERE Band.bid = MemberOf.bid AND MemberOf.mid = Member.mid AND MemberOf.endyear IS NULL ORDER BY Band.name, Member.name";
Statement s = conn.createStatement();
ResustSet r = s.exectuteQuery(Qurrey);
String last = r.getString("bname");
System.out.println(bname);
System.out.println("\t" + r.getString("mname") + " " + r.getString("inst"));
while(r.getNext()){
  String tmp = r.getString("bname");
  if(last.compareTo(tmp) != 0){
      last = tmp;
      System.out.println(tmp);
  }
  System.out.println("\t" + r.getString("mname") + " " + r.getString("inst"));
}
*/

