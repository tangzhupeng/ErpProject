package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_customer_grade", schema = "", catalog = "erp3")
public class ErpCustomerGrade {
    private Integer gradeId;
    private String gradeName;

    @Id
    @Column(name = "grade_id")
    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "grade_name")
    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpCustomerGrade that = (ErpCustomerGrade) o;
        return gradeId == that.gradeId &&
                Objects.equals(gradeName, that.gradeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradeId, gradeName);
    }
}
