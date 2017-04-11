package ua.kh.butov.blog.entity;

import java.io.Serializable;

import ua.kh.butov.blog.model.AbstractModel;

public class AbstractEntity<PK> extends AbstractModel implements Serializable {
	private static final long serialVersionUID = 6750816442772298113L;
	private PK id;
	public PK getId() {
		return id;
	}
	public void setId(PK id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEntity other = (AbstractEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}