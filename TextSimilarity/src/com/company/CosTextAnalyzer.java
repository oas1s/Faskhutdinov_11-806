package com.company;

import java.util.ArrayList;
import java.util.List;

public class CosTextAnalyzer implements TextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2){
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        List<String> uList = tokenize(te1.getText()+ " " + te2.getText());
        return cosSimilarity(list1, list2, uList);
    }

    private double cosSimilarity(List<String> l1, List<String> l2, List<String> ul){
        double simmilarity = 0;
        List<Double> vector1 = vectorize(l1,ul);
        List<Double> vector2 = vectorize(l2,ul);
        for (int i = 0; i < ul.size(); i++) {
            simmilarity += vector1.get(i) * vector2.get(i);
        }
        return simmilarity;
    }

    private List<Double> vectorize(List<String> words,List<String> uWords) {
        List<Double> vectors = new ArrayList<>();
        List<Integer> freq = new ArrayList<>();
        double k = 0;

        for (int i = 0; i < uWords.size(); i++) {
            freq.add(i,0);
        }

        for (int i = 0; i < uWords.size(); i++) {
            if(words.contains(uWords.get(i))){
                freq.set(i,freq.get(i)+1);
                k++;
            }
        }

        k = Math.sqrt(k);

        for (int i = 0; i < uWords.size() ; i++) {
            vectors.add(i,((double) freq.get(i) / k));
        }

        return vectors;
    }

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            if (!uniqueWords.contains(word))
                uniqueWords.add(word);
        }
        return uniqueWords;
    }
}