package SOLIDPrinciples.LSP;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LSPMain {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Life Time Member",new Date()));
        myList.add(new AnnualMember("Annual Member",new Date()));
        myList.add(new EnquiryUser("Enquiry User"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }
}
