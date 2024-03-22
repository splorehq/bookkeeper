package com.example.bookkeeper.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.sql.Timestamp;

@Entity(name = "system_site_data")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(uniqueConstraints = {@UniqueConstraint(name = "UniqueBaseIdGroupIdAndURLPath", columnNames = {"base_id", "group_id", "url_path"})})
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SystemSiteData {
    @Id
    @Column(
            columnDefinition = "TEXT"
    )
    private String id;

    @Column(
            columnDefinition = "TEXT"
    )
    private String baseId;

    @Column(
            columnDefinition = "TEXT"
    )
    private String groupId;

    @Column(
            columnDefinition = "TEXT"
    )
    private String urlPath;

    @Column(
            columnDefinition = "TEXT"
    )
    private String docId;

    @Column(
            columnDefinition = "TEXT"
    )
    private String contentHash;

    @Column(
            columnDefinition = "INT"
    )
    private Integer httpStatus;

    @Column(
            columnDefinition = "TEXT"
    )
    private String ingestionJobRef;

    @Column(
            columnDefinition = "BOOLEAN"
    )
    private Boolean isFiltered;

    @Column(
            columnDefinition = "BOOLEAN"
    )
    private Boolean isAtDT1;

    @Column(
            columnDefinition = "BOOLEAN"
    )
    private Boolean isAtST0;

    @Column(
            columnDefinition = "BOOLEAN"
    )
    private Boolean isAtST1;

    @CreationTimestamp
    @Column(
            columnDefinition = "TIMESTAMP"
    )
    private Date createdAt;

    @UpdateTimestamp
    @Column(
            columnDefinition = "TIMESTAMP"
    )
    private Date updatedAt;
}
