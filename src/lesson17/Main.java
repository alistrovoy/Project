package lesson17;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Tovar rukzak = new Tovar();
        rukzak.setMainName("Рюкзак mark Ryden MR-9032");
        rukzak.setArtikul("MR-9032");
        rukzak.setOpisanie("Компактный городской рюкзак – отличный выбор для тех, кто привык идти вперед. Современные дизайн-решения и материалы премиум качества делают рюкзак отличным дополнением к любому стилю.\n" +
                "\n" +
                "Особенности:\n" +
                "\n" +
                "Ортопедическая спинка – три слоя высокотехнологичных материалов – и удобные мягкие лямки, регулирующийся по высоте\n" +
                "Внешний USB-порт.\n" +
                "Лёгкий, компактный городской рюкзак для тех, кто живёт в ритме города.\n" +
                "Рюкзак отлично держит форму и занимает минимум места – удобно в транспорте, на мероприятиях, на прогулках.\n" +
                "Система крепления телефона на лямке рюкзака OCTOPUS, внешний USB-порт – звони, снимай фото и видео не снимая с рюкзака.\n" +
                "Трёхслойная ортопедическая спинка с вентилируемой сеткой и мягкие лямки обеспечивают удобное использование.\n" +
                "<br>        \n" +
                "        Подробнее: https://www.rukzakoff.ru/product/ryukzak-mark-ryden-mr-9032/");


        rukzak.setOstatokNaSklade(24);
        rukzak.setPriceFull(3990);
        rukzak.setPathToImage("https://img.rukzakoff.ru/wa-data/public/shop/products/42/72/27242/images/135952/135952.750x0.jpg");
        Otsiv otsiv = new Otsiv();
        Date date = new Date();
        otsiv.setDataPublikasii(date);
        otsiv.setNameAuthor("Author");
        otsiv.setOtsiv("Отзыв о товаре цукенгшщдлорпавыфвапрольтимсчя");
        otsiv.setReiting(5);
        otsiv.setTema("Отзыв на рюкзак MR-9032");
        otsiv.setTrueFoto(true);
        otsiv.setTrueOpisanie(true);
        otsiv.setTrueRazmer(true);
        rukzak.addOtsiv(otsiv);



        Otsiv otsiv1 = new Otsiv();
        otsiv1.setDataPublikasii(date);
        otsiv1.setNameAuthor("Author");
        otsiv1.setOtsiv("Отзыв о товаре цукенгшщдлорпавыфвапрольтимсчя");
        otsiv1.setReiting(4);
        otsiv1.setTema("Отзыв на рюкзак MR-9032");
        otsiv1.setTrueFoto(true);
        otsiv1.setTrueOpisanie(true);
        otsiv1.setTrueRazmer(true);
        rukzak.addOtsiv(otsiv1);


        Haracteristika vmeshaetA4 = new Haracteristika();
        vmeshaetA4.setKey("A4");
        vmeshaetA4.setPodskazka("Вмещает или нет ");
        vmeshaetA4.setValue("A4");

        Haracteristika spinka = new Haracteristika();
        spinka.setValue("Ортоп");
        spinka.setPodskazka("Ортпо");
        spinka.setKey("Ортпо");

        Haracteristika material = new Haracteristika();
        material.setKey("Полиестер");
        material.setPodskazka("материал рюкзака");
        material.setValue("Полиестер");

        rukzak.addHaraktertistika(spinka);
        rukzak.addHaraktertistika(material);
        rukzak.addHaraktertistika(vmeshaetA4);

        Foto foto = new Foto();
        foto.setPathToBigFoto("foto1.png");
        foto.setPathToSmallFoto("foto2.png");

        rukzak.addFoto(foto);


        rukzak.addOtsiv(otsiv);
        rukzak.addOtsiv(otsiv1);

        rukzak.printOtziviByRate();

    }
}
