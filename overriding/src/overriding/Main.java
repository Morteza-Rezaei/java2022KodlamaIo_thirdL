package overriding;

public class Main {

	public static void main(String[] args)
	// dizi ile
	{
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(),
				new TarimKrediManager(), new OgrenciKrediManager() };
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}

		// tek tek newlemek
		BaseKrediManager baseKrediManager = new OgrenciKrediManager();
		System.out.println(baseKrediManager.hesapla(1000));

	}

}
