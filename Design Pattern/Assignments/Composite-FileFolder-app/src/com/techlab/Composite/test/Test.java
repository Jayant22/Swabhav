package com.techlab.Composite.test;

import com.techlab.Composite.*;

public class Test {

	public static void main(String[] args) {

		Folders movieFolder = new Folders("movie");
		Folders actionFolder = new Folders("action");
		Folders comedyFolder = new Folders("comedy");

		Files abcFile = new Files("abc", 100, "avi");
		Files defFile = new Files("def", 100, "mp4");
		Files mnoFile = new Files("mno", 100, "avi");
		Files pqrFile = new Files("pqr", 100, "mp4");
		Files xyzFile = new Files("xyz", 100, "avi");
		Files ghiFile = new Files("ghi", 100, "mp4");
		
		movieFolder.addChildren(actionFolder);
		movieFolder.addChildren(comedyFolder);
		
		actionFolder.addChildren(abcFile);
		actionFolder.addChildren(defFile);
		actionFolder.addChildren(mnoFile);
		
		comedyFolder.addChildren(pqrFile);
		comedyFolder.addChildren(xyzFile);
		comedyFolder.addChildren(ghiFile);	
		
		StringBuilder sb = movieFolder.display();
		
		System.out.println(sb.toString());
	}
}
