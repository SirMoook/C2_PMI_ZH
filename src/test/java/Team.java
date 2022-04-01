import java.util.ArrayList;

public class Team {
    protected ArrayList<String> memberName=new ArrayList<>();
    protected ArrayList<String> memberPosition=new ArrayList<>();

    public void newMember(String name,String position){
        memberName.add(name);
        memberPosition.add(position);

    }

    public void leaveTeam(String name){
        int index=memberName.indexOf(name);
        memberPosition.remove(index);
        memberName.remove(index);
    }

    public String getMembers(){
        StringBuilder result=new StringBuilder();
        for (int i=0;i<memberName.size();i++){
            //String dataInString=memberName.get(i)+" "+memberPosition.get(i);
            if (i>0){
                result.append("\r\n");
            }
            result.append(memberName.get(i)).append(" ").append(memberPosition.get(i));
        }
        return result.toString();
    }

}
