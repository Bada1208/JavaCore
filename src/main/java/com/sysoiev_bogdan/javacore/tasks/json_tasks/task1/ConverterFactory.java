package com.sysoiev_bogdan.javacore.tasks.json_tasks.task1;

public class ConverterFactory {

    /**
     * Get the corresponding converter based on the given measurement type
     *
     * @param measurementType the type of measurement
     * @return the corresponding converter
     */
    public Converter getConverter(String measurementType) {
        if (measurementType.equals("length")) {
            return new Length();
        }
        return null;
    }
}
