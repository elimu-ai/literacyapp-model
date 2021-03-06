package ai.elimu.model.v1.gson.content.multimedia;

import java.util.List;
import java.util.Set;
import ai.elimu.model.enums.content.LiteracySkill;
import ai.elimu.model.enums.content.NumeracySkill;
import ai.elimu.model.v1.gson.content.ContentGson;
import ai.elimu.model.v1.gson.content.LetterGson;
import ai.elimu.model.v1.gson.content.NumberGson;
import ai.elimu.model.v1.gson.content.WordGson;

/**
 * For documentation, see https://github.com/elimu-ai/webapp/tree/master/src/main/java/ai/elimu/model
 */
@Deprecated
public abstract class MultimediaGson extends ContentGson {
    
    private byte[] bytes;
    
    private String downloadUrl;
    
    private Integer downloadSize;

    private String contentType;
    
    private Set<LiteracySkill> literacySkills;
    
    private Set<NumeracySkill> numeracySkills;
    
    private List<LetterGson> letters;
    
    private List<NumberGson> numbers;
    
    private List<WordGson> words;
    
    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Set<LiteracySkill> getLiteracySkills() {
        return literacySkills;
    }

    public void setLiteracySkills(Set<LiteracySkill> literacySkills) {
        this.literacySkills = literacySkills;
    }

    public Set<NumeracySkill> getNumeracySkills() {
        return numeracySkills;
    }

    public void setNumeracySkills(Set<NumeracySkill> numeracySkills) {
        this.numeracySkills = numeracySkills;
    }

    public List<LetterGson> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterGson> letters) {
        this.letters = letters;
    }

    public List<NumberGson> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<NumberGson> numbers) {
        this.numbers = numbers;
    }

    public List<WordGson> getWords() {
        return words;
    }

    public void setWords(List<WordGson> words) {
        this.words = words;
    }
}
