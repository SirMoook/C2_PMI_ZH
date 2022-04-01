public class PositionChanges extends Team{

    public void promote(String name , String position){
        int index =memberName.indexOf(name);
        memberPosition.remove(index);
        memberPosition.add(index,position);

    }
}
