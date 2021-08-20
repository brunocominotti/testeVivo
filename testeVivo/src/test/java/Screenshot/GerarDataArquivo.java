package Screenshot;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GerarDataArquivo {
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(ts);

	}

}
