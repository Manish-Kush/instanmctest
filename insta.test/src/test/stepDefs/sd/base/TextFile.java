package sd.base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TextFile {

	private ConfigReader configReader;

	public TextFile() {
		configReader = new ConfigReader();
	}

	public List<String> getErrorList() throws IOException {
		return FileUtils.readLines(new File(configReader.getErrorFilePath()), "utf-8");
	}

}
