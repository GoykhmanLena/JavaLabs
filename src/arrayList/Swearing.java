package arrayList;
import record.Swear;
import customException.SwearingException;
import java.util.ArrayList;

public class Swearing {

    ArrayList<Swear> swearList = new ArrayList<>();

    public void addSwear(Swear swear) {
        swearList.add(swear);
    }

    public String getSwears() {
        StringBuilder s = new StringBuilder();
        try {
            for (int i = 0; i < 10; i++) {
                if (i >= swearList.size()) {
                    throw new SwearingException("PS: Ошибка при доступе к элементу списка.", i);
                }
                s.append(swearList.get(i).context()).append(" ").append(swearList.get(i).word()).append(", ");
            }
        } catch (SwearingException e) {
            System.out.println(e.getMessage());
        }
        return s.toString();
    }
}
