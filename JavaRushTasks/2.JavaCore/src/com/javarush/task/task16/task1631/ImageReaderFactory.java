package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by user on 4/10/2018.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {

            if (imageTypes==(ImageTypes.BMP)) {
                return new BmpReader();
            } else if(imageTypes==(ImageTypes.JPG)){
                return new JpgReader();
            } else if (imageTypes==(ImageTypes.PNG)){
                return new PngReader();
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
    }

}
