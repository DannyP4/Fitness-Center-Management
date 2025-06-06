export default function MemberTable({ data, onUpdateNote }) {
    return (
        <table className="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>Registered PackagesID</th>
                </tr>
            </thead>
            <tbody>
                {data.length === 0 ? (
                    <tr>
                        <td colSpan="8" style={{ textAlign: 'center', padding: '1rem' }}>
                            No members found
                        </td>
                    </tr>
                ) : (
                    data.map(member => (
                        <tr key={member.id}>
                            <td>{member.id}</td>
                            <td>{member.name}</td>
                            <td>{member.phone_number}</td>
                            <td>{member.address}</td>
                            <td>{member.package_id || 'None'}</td>
                        </tr>
                    ))
                )}
            </tbody>
        </table>
    );
}
