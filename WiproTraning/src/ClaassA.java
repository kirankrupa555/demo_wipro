


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class ClaassA {
	void meth1()
	{
		System.out.println("--Implementing Map Interface--");
		HashMap<Object,Object>map=new HashMap<Object,Object>();
		//LinkedHashMap<Object,Object>map=new LinkedHashMap<Object,Object>();
		map.put(101, "java");
		map.put("java", 1000);
		map.put(null, null);
		map.put(105, "css");
		map.put(102, "css");
		map.put(104, "Html");
		map.put("spring", 2000);
		map.put(103, "Aws");
		System.out.println(map);
		System.out.println("103:"+map.get(103)+"\n");
		map.put(103, "Git");
		HashSet<Object>hs1=new HashSet<Object>(map.keySet());
		System.out.println("keys in map:"+hs1);
		Iterator<Object>i1=hs1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("----------------");
		HashSet<Object> hs2=new HashSet<Object>(map.entrySet());
		Iterator<Object>i2=hs2.iterator();
		while(i2.hasNext())
		{
			//System.out.println(i2.next());
			Entry e=(Entry)i2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("---------------");
		LinkedHashSet<Object>lhs=new LinkedHashSet<Object>(map.entrySet());
		Iterator<Object>i3=lhs.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
	}
	public static void main(String[] args) {
		ClaassA aobj=new ClaassA();
		aobj.meth1();
	}

}
