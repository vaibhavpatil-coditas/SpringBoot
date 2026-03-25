package com.week8.assignment.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActivityLogStore {

    private final List<String> logs = new ArrayList<>();

    public void addLog(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }
}
