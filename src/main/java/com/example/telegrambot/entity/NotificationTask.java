package com.example.telegrambot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long chatId;

    private  String text;

    private LocalDateTime execDate;

    public   NotificationTask(Long chatId, String text, LocalDateTime execDate){
        this.chatId = chatId;
        this.text = text;
        this.execDate = execDate;
    }

    public   NotificationTask(){}

    public Long getId() {
        return id;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getExecDate() {
        return execDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setExecDate(LocalDateTime execDate) {
        this.execDate = execDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return Objects.equals(id, that.id) && Objects.equals(chatId, that.chatId) && Objects.equals(text, that.text) && Objects.equals(execDate, that.execDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, text, execDate);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", text='" + text + '\'' +
                ", execDate=" + execDate +
                '}';
    }

}
