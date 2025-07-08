class Solution {
    public List<List<Integer>> generate(int numRows) {
         
List<List<Integer>> mylist= new ArrayList <> ();

for(int i=0;i<numRows;i++)
{
List<Integer> row = new ArrayList <> ();
int j=1,left=0,right=1;
row.add(1);
while(j<i)
{
if((i-1)>=0 && j<mylist.get(i-1).size())
{row.add(mylist.get(i-1).get(left)+mylist.get(i-1).get(right));
left=right;
right++;}
j++;


}
if(i>0)
{row.add(1);}
mylist.add(row);
}
return mylist;     
}
}
