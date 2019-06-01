import java.util.Hashtable;

class SensitiveHash {
    private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();

    public void addEntry(Integer k, String v) {
        ht.put(k, v);
    }

    public void removeEntry(Object key) {
        check("removeKeyPermission");
        ht.remove(key);
    }

    private void check(String directive) {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            sm.checkSecurityAccess(directive);
        }
    }
}

//
// Run using
//      java -Djava.security.manager -Djava.security.policy=my.policy SecManager
//
public class SecManager {
    public static void main(String[] args) {
        SensitiveHash sh = new SensitiveHash();
        Integer k = new Integer(10);
        sh.addEntry(k, "ana");
        sh.removeEntry(k);
    }
}
