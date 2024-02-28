package model;

public class BoardDTO {
    private int id;
    private String title;
    private String content;
    private String writer;

    @Override
    public String toString() {
        return "게시글{" +
                "제목='" + title + '\'' +
                ", 내용='" + content + '\'' +
                ", 글쓴이='" + writer + '\'' +
                '}';
    }

    public BoardDTO(String subject, String content, String writer){
        this.title = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getSubject() {return title;}
    public void setSubject(String subject) {this.title = subject;}
    public String getContent() {return content;}
    public void setContent(String content) {this.title = content;}
    public String getWriter() {return writer;}
    public void setWriter(String writer) {this.title = writer;}
}
