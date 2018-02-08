package datatransportation.sinan.com.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by sinan on 08.02.2018.
 */
data class UserModelParcelable(val name: String, val phone: String) : Parcelable {
    constructor(source: Parcel) : this(
            source.readString(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(name)
        writeString(phone)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<UserModelParcelable> = object : Parcelable.Creator<UserModelParcelable> {
            override fun createFromParcel(source: Parcel): UserModelParcelable = UserModelParcelable(source)
            override fun newArray(size: Int): Array<UserModelParcelable?> = arrayOfNulls(size)
        }
    }
}