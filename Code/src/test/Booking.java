/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author student
 */
@Entity
@Table(name = "booking", catalog = "hotel_canva", schema = "")
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
    , @NamedQuery(name = "Booking.findByBookingno", query = "SELECT b FROM Booking b WHERE b.bookingno = :bookingno")
    , @NamedQuery(name = "Booking.findByName", query = "SELECT b FROM Booking b WHERE b.name = :name")
    , @NamedQuery(name = "Booking.findByPhoneno", query = "SELECT b FROM Booking b WHERE b.phoneno = :phoneno")
    , @NamedQuery(name = "Booking.findByNorooms", query = "SELECT b FROM Booking b WHERE b.norooms = :norooms")
    , @NamedQuery(name = "Booking.findByRoomtype", query = "SELECT b FROM Booking b WHERE b.roomtype = :roomtype")
    , @NamedQuery(name = "Booking.findByCharges", query = "SELECT b FROM Booking b WHERE b.charges = :charges")
    , @NamedQuery(name = "Booking.findByTotal", query = "SELECT b FROM Booking b WHERE b.total = :total")
    , @NamedQuery(name = "Booking.findByNodays", query = "SELECT b FROM Booking b WHERE b.nodays = :nodays")})
public class Booking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookingno")
    private Integer bookingno;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "phoneno")
    private int phoneno;
    @Basic(optional = false)
    @Column(name = "norooms")
    private int norooms;
    @Basic(optional = false)
    @Column(name = "roomtype")
    private String roomtype;
    @Basic(optional = false)
    @Column(name = "charges")
    private int charges;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @Column(name = "nodays")
    private Integer nodays;

    public Booking() {
    }

    public Booking(Integer bookingno) {
        this.bookingno = bookingno;
    }

    public Booking(Integer bookingno, String name, int phoneno, int norooms, String roomtype, int charges, int total) {
        this.bookingno = bookingno;
        this.name = name;
        this.phoneno = phoneno;
        this.norooms = norooms;
        this.roomtype = roomtype;
        this.charges = charges;
        this.total = total;
    }

    public Integer getBookingno() {
        return bookingno;
    }

    public void setBookingno(Integer bookingno) {
        Integer oldBookingno = this.bookingno;
        this.bookingno = bookingno;
        changeSupport.firePropertyChange("bookingno", oldBookingno, bookingno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        int oldPhoneno = this.phoneno;
        this.phoneno = phoneno;
        changeSupport.firePropertyChange("phoneno", oldPhoneno, phoneno);
    }

    public int getNorooms() {
        return norooms;
    }

    public void setNorooms(int norooms) {
        int oldNorooms = this.norooms;
        this.norooms = norooms;
        changeSupport.firePropertyChange("norooms", oldNorooms, norooms);
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        String oldRoomtype = this.roomtype;
        this.roomtype = roomtype;
        changeSupport.firePropertyChange("roomtype", oldRoomtype, roomtype);
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        int oldCharges = this.charges;
        this.charges = charges;
        changeSupport.firePropertyChange("charges", oldCharges, charges);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public Integer getNodays() {
        return nodays;
    }

    public void setNodays(Integer nodays) {
        Integer oldNodays = this.nodays;
        this.nodays = nodays;
        changeSupport.firePropertyChange("nodays", oldNodays, nodays);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingno != null ? bookingno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookingno == null && other.bookingno != null) || (this.bookingno != null && !this.bookingno.equals(other.bookingno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.Booking[ bookingno=" + bookingno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
