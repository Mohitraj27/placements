package Arrays;

public class solution {
    
}
public int GetBuildingCount(int input1,int[][] input2){
    HashSet<Integer> hs1=new HashSet<Integer>();
    HashSet<Integer> hs2=new HashSet<Integer>();int cnt=0;
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int i=0;i<input1;i++){
        if(!hs1.contains(input2[i][0])){
            hs1.add(input2[i][0]);
        }
        else{
            cnt++;
        }
        if(!hs2.contains(input2[i][1])){
            hs2.add(input2[i][0]);
        }
        else{
            cnt++;
        }
    }
    int x=hs1.size()>hs2.size()?hs1.size():hs2.size();
    for(int i=0;i<x;i++){
        hs.add(hs1.get(i));
        hs.add(hs2.get(i));
    }
    int res=8*(hs1.size()+hs2.size())-hs.size();
    System.out.println(res);
}